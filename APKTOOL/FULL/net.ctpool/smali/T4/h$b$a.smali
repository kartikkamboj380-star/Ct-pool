.class LT4/h$b$a;
.super LT4/h$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT4/h$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:LT4/h$b;


# direct methods
.method constructor <init>(LT4/h$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT4/h$b$a;->q:LT4/h$b;

    .line 2
    .line 3
    iget-object p1, p1, LT4/h$b;->m:LT4/h;

    .line 4
    .line 5
    invoke-direct {p0, p1}, LT4/h$d;-><init>(LT4/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public d()Ljava/util/Map$Entry;
    .locals 1

    .line 1
    invoke-virtual {p0}, LT4/h$d;->c()LT4/h$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LT4/h$b$a;->d()Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
