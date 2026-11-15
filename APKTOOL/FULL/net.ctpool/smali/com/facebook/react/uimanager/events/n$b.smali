.class public Lcom/facebook/react/uimanager/events/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Ljava/util/Map;

.field private f:Ljava/util/Map;

.field private g:Ljava/util/Map;

.field private h:Ljava/util/Map;

.field private i:Ljava/util/Set;


# direct methods
.method public constructor <init>(IIIILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/react/uimanager/events/n$b;->a:I

    iput p2, p0, Lcom/facebook/react/uimanager/events/n$b;->b:I

    iput p3, p0, Lcom/facebook/react/uimanager/events/n$b;->c:I

    iput p4, p0, Lcom/facebook/react/uimanager/events/n$b;->d:I

    iput-object p5, p0, Lcom/facebook/react/uimanager/events/n$b;->e:Ljava/util/Map;

    iput-object p6, p0, Lcom/facebook/react/uimanager/events/n$b;->f:Ljava/util/Map;

    iput-object p7, p0, Lcom/facebook/react/uimanager/events/n$b;->g:Ljava/util/Map;

    iput-object p8, p0, Lcom/facebook/react/uimanager/events/n$b;->h:Ljava/util/Map;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/n$b;->i:Ljava/util/Set;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/uimanager/events/n$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/uimanager/events/n$b;->a:I

    return p0
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/n$b;->b:I

    return v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->g:Ljava/util/Map;

    return-object v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->f:Ljava/util/Map;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->f:Ljava/util/Map;

    iget v1, p0, Lcom/facebook/react/uimanager/events/n$b;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->i:Ljava/util/Set;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/n$b;->c:I

    return v0
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->e:Ljava/util/Map;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/n$b;->a:I

    return v0
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->h:Ljava/util/Map;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/n$b;->d:I

    return v0
.end method

.method public l(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n$b;->i:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
