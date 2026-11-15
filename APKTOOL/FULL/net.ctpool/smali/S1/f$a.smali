.class public final LS1/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/Map;

.field private b:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, LS1/f$a;->a:Ljava/util/Map;

    const/4 v0, 0x1

    iput-boolean v0, p0, LS1/f$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(LS1/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LS1/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 2

    .line 1
    iget-boolean v0, p0, LS1/f$a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LS1/f$a;->b:Z

    .line 7
    .line 8
    iget-object v0, p0, LS1/f$a;->a:Ljava/util/Map;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "Underlying map has already been built"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;
    .locals 1

    .line 1
    iget-boolean v0, p0, LS1/f$a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LS1/f$a;->a:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "Underlying map has already been built"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1
.end method
