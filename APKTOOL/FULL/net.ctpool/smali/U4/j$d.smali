.class final LU4/j$d;
.super LU4/j$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU4/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final b:LT4/i;


# direct methods
.method constructor <init>(LT4/i;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LU4/j$b;-><init>(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU4/j$d;->b:LT4/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LU4/j$d;->b:LT4/i;

    .line 2
    .line 3
    invoke-interface {v0}, LT4/i;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method g(Ljava/lang/Object;LY4/a;LU4/j$c;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p2, p1}, LU4/j$c;->b(LY4/a;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
