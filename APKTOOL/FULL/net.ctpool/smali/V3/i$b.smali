.class LV3/i$b;
.super LV3/i$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/i;->z()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:LV3/i;


# direct methods
.method constructor <init>(LV3/i;)V
    .locals 1

    .line 1
    iput-object p1, p0, LV3/i$b;->q:LV3/i;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, LV3/i$e;-><init>(LV3/i;LV3/i$a;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method bridge synthetic d(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/i$b;->f(I)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method f(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    new-instance v0, LV3/i$g;

    .line 2
    .line 3
    iget-object v1, p0, LV3/i$b;->q:LV3/i;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LV3/i$g;-><init>(LV3/i;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
