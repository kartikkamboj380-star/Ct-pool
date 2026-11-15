.class Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;->signIn(Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:LA0/g;

.field final synthetic n:Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;


# direct methods
.method constructor <init>(Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;LA0/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;->n:Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;->m:LA0/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/RNAppleAuthentication/AppleAuthenticationAndroidModule$b;->m:LA0/g;

    invoke-virtual {v0}, LA0/g;->a()V

    return-void
.end method
