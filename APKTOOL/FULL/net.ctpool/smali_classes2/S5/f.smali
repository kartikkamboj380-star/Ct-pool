.class public LS5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LS5/f;


# instance fields
.field public a:Ll6/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LS5/f;

    .line 2
    .line 3
    invoke-direct {v0}, LS5/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LS5/f;->b:LS5/f;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ll6/c;->b()Ll6/d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ll6/d;->a()Ll6/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LS5/f;->a:Ll6/c;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, LS5/f;->b:LS5/f;

    .line 2
    .line 3
    iget-object v0, v0, LS5/f;->a:Ll6/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ll6/c;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, LS5/f;->b:LS5/f;

    .line 2
    .line 3
    iget-object v0, v0, LS5/f;->a:Ll6/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ll6/c;->n(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, LS5/f;->b:LS5/f;

    .line 2
    .line 3
    iget-object v0, v0, LS5/f;->a:Ll6/c;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ll6/c;->p(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
