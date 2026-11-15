.class public Lcom/facebook/react/fabric/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReactMarker$FabricMarkerListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/b$b;,
        Lcom/facebook/react/fabric/b$c;,
        Lcom/facebook/react/fabric/b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/react/fabric/l;

.field public static final d:Lcom/facebook/react/fabric/l;

.field public static final e:Lcom/facebook/react/fabric/l;

.field public static final f:Lcom/facebook/react/fabric/l;

.field public static final g:Lcom/facebook/react/fabric/l;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/fabric/l;

    invoke-direct {v0}, Lcom/facebook/react/fabric/l;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/b;->c:Lcom/facebook/react/fabric/l;

    new-instance v0, Lcom/facebook/react/fabric/l;

    invoke-direct {v0}, Lcom/facebook/react/fabric/l;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/b;->d:Lcom/facebook/react/fabric/l;

    new-instance v0, Lcom/facebook/react/fabric/l;

    invoke-direct {v0}, Lcom/facebook/react/fabric/l;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/b;->e:Lcom/facebook/react/fabric/l;

    new-instance v0, Lcom/facebook/react/fabric/l;

    invoke-direct {v0}, Lcom/facebook/react/fabric/l;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/b;->f:Lcom/facebook/react/fabric/l;

    new-instance v0, Lcom/facebook/react/fabric/l;

    invoke-direct {v0}, Lcom/facebook/react/fabric/l;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/b;->g:Lcom/facebook/react/fabric/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/fabric/b;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/fabric/b;->b:Ljava/util/List;

    return-void
.end method

.method private static b(Lcom/facebook/react/bridge/ReactMarkerConstants;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_COMMIT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_FINISH_TRANSACTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_DIFF_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_UPDATE_UI_MAIN_THREAD_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_UPDATE_UI_MAIN_THREAD_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_LAYOUT_AFFECTED_NODES:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private c(Lcom/facebook/react/fabric/b$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/fabric/b$a;

    invoke-interface {v1, p1}, Lcom/facebook/react/fabric/b$a;->a(Lcom/facebook/react/fabric/b$b;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/react/fabric/b$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Lcom/facebook/react/fabric/b$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/fabric/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJ)V
    .locals 7

    .line 1
    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/fabric/b;->logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V

    return-void
.end method

.method public logFabricMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;IJI)V
    .locals 2

    .line 2
    invoke-static {p1}, Lcom/facebook/react/fabric/b;->b(Lcom/facebook/react/bridge/ReactMarkerConstants;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/facebook/react/fabric/b;->a:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/facebook/react/fabric/b$b;

    if-nez p2, :cond_0

    new-instance p2, Lcom/facebook/react/fabric/b$b;

    const/4 v0, 0x0

    invoke-direct {p2, p3, v0}, Lcom/facebook/react/fabric/b$b;-><init>(ILcom/facebook/react/fabric/c;)V

    iget-object v0, p0, Lcom/facebook/react/fabric/b;->a:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v0, Lcom/facebook/react/fabric/b$c;

    invoke-direct {v0, p4, p5, p6}, Lcom/facebook/react/fabric/b$c;-><init>(JI)V

    invoke-static {p2, p1, v0}, Lcom/facebook/react/fabric/b$b;->a(Lcom/facebook/react/fabric/b$b;Lcom/facebook/react/bridge/ReactMarkerConstants;Lcom/facebook/react/fabric/b$c;)V

    sget-object p6, Lcom/facebook/react/bridge/ReactMarkerConstants;->FABRIC_BATCH_EXECUTION_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    if-ne p1, p6, :cond_1

    const-wide/16 v0, 0x0

    cmp-long p1, p4, v0

    if-lez p1, :cond_1

    invoke-direct {p0, p2}, Lcom/facebook/react/fabric/b;->c(Lcom/facebook/react/fabric/b$b;)V

    iget-object p1, p0, Lcom/facebook/react/fabric/b;->a:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
