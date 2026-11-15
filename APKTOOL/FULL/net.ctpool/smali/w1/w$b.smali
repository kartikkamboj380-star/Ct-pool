.class Lw1/w$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw1/w;->w(Lw1/n$a;)LS0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw1/n$a;

.field final synthetic b:Lw1/w;


# direct methods
.method constructor <init>(Lw1/w;Lw1/n$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/w$b;->b:Lw1/w;

    .line 2
    .line 3
    iput-object p2, p0, Lw1/w$b;->a:Lw1/n$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lw1/w$b;->b:Lw1/w;

    .line 2
    .line 3
    iget-object v0, p0, Lw1/w$b;->a:Lw1/n$a;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lw1/w;->g(Lw1/w;Lw1/n$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
