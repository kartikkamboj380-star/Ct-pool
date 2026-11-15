.class public final synthetic LQ3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/f;


# instance fields
.field public final synthetic a:LQ3/A;

.field public final synthetic b:Lz3/m;


# direct methods
.method public synthetic constructor <init>(LQ3/A;Lz3/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ3/r;->a:LQ3/A;

    .line 5
    .line 6
    iput-object p2, p0, LQ3/r;->b:Lz3/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, LQ3/r;->a:LQ3/A;

    .line 2
    .line 3
    iget-object v1, p0, LQ3/r;->b:Lz3/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, LQ3/A;->t(Lz3/m;Lz3/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
